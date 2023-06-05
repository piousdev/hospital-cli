package hospital.cli;

import java.util.List;

/**
 * The VisitorService interface provides methods to register visitors and get a report of all visitors.
 */
public interface VisitorService {

    /**
     * Registers a visitor.
     *
     * @param visitor the visitor to register.
     */
    void registerVisitor(Visitor visitor);

    /**
     * Returns a report of all visitors.
     *
     * @return the visitors report
     */
    List<Visitor> getVisitorsReport();
}
