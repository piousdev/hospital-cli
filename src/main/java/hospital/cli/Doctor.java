package hospital.cli;

/**
 * The Doctor record represents a doctor with a name and a specialty.
 *
 * A record is a concise way to define classes that primarily hold data. In this case, the Doctor record holds data about a doctor in a hospital.
 *
 * @param name the name of the doctor.
 * @param specialty the specialty of the doctor.
 */
public record Doctor(String name, String specialty) {
}
