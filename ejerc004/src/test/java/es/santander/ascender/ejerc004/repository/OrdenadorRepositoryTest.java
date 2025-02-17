package es.santander.ascender.ejerc004.repository;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import es.santander.ascender.ejerc004.model.Ordenador;

@SpringBootTest
public class OrdenadorRepositoryTest {

     @Autowired
        private OrdenadorRepository repository;

        @Test
        public void testCreate() {
                Ordenador ordenador = new Ordenador();
                ordenador.setColor("azul");
                ordenador.setPeso(2.5);
                ordenador.setLetras(35);
                ordenador.setIntel(false);

                repository.save(ordenador);
                assertTrue(
                                repository
                                                .findById(ordenador.getId())
                                                .isPresent());
        }

        @Test
        public void delete() {
            Ordenador ordenador = new Ordenador();
            ordenador.setColor("azul");
            ordenador.setPeso(2.5);
            ordenador.setLetras(35);
            ordenador.setIntel(false);

            repository.save(ordenador);
                assertTrue(
                                repository
                                                .findById(ordenador.getId())
                                                .isPresent());
                repository.deleteById(ordenador.getId());
        }

        @Test
        public void update() {
            Ordenador ordenador = new Ordenador();
            ordenador.setColor("azul");
            ordenador.setPeso(2.5);
            ordenador.setLetras(35);
            ordenador.setIntel(false);

            repository.save(ordenador);
                assertTrue(
                                repository
                                                .existsById(ordenador.getId()));
                ordenador.setColor("negro");
                repository.save(ordenador);
                Optional<Ordenador> updatedOrdenador= repository.findById(ordenador.getId());
                assertTrue(updatedOrdenador.isPresent());
                assertTrue(updatedOrdenador.get().getColor() == "negro");
        }

}
