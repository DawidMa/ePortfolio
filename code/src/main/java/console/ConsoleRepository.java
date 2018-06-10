package console;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ConsoleRepository extends CrudRepository<Console, Long>{

    List<Console> findByName(String name);

}
