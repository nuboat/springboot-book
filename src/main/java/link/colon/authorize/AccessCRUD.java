package link.colon.authorize;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AccessCRUD extends CrudRepository<Access, Long> {

    Optional<Access> findByToken(final String token);

}
