package hospital.cli;

import java.util.ArrayList;
import java.util.List;

/**
 * The VisitorRepositoryImpl class is a repository that stores visitors in memory.
 * It provides methods to save visitors and retrieve all visitors.
 */
public class VisitorRepositoryImpl implements VisitorRepository {
	private final List<Visitor> visitors = new ArrayList<>();

	/**
	 * Saves a visitor to the repository.
	 *
	 * @param visitor the visitor to be saved.
	 */
	@Override
	public void save(Visitor visitor) {
		visitors.add(visitor);
	}

	/**
	 * Retrieves all visitors from the repository.
	 *
	 * @return a list of all visitors in the repository.
	 */
	@Override
	public List<Visitor> findAll() {
		return new ArrayList<>(visitors);
	}
}