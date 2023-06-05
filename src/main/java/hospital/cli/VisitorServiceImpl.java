package hospital.cli;

import java.util.List;

/**
 * The VisitorServiceImpl class is a service that provides methods to register visitors and get a report of all visitors.
 * It implements the VisitorService interface.
 */
public class VisitorServiceImpl implements VisitorService {
	private final VisitorRepository visitorRepository;

	/**
	 * Constructs a new VisitorService instance with a given VisitorRepository.
	 *
	 * @param visitorRepository the repository that will be used to save and retrieve Visitor data.
	 */
	public VisitorServiceImpl(VisitorRepository visitorRepository) {
		this.visitorRepository = visitorRepository;
	}

	/**
	 * Registers a new visitor in the system.
	 *
	 * @param visitor the visitor to be registered.
	 */
	@Override
	public void registerVisitor(Visitor visitor) {
		visitorRepository.save(visitor);
	}

	/**
	 * Retrieves a report of all registered visitors.
	 *
	 * @return a list of all visitors in the system.
	 */
	@Override
	public List<Visitor> getVisitorsReport() {
		return visitorRepository.findAll();
	}
}