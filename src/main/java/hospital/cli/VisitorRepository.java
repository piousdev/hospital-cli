package hospital.cli;

import java.util.List;

/**
 * The VisitorRepository interface provides methods to save visitors and retrieve all visitors.
 */
public interface VisitorRepository {

    /**
     * Saves a visitor.
     *
     * @param visitor the visitor to be saved.
     */
    void save(Visitor visitor);

    /**
     * Retrieves all visitors.
     *
     * @return a list of all visitors.
     */
    List<Visitor> findAll();
}
