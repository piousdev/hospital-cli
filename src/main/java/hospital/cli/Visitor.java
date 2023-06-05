package hospital.cli;

import java.time.LocalDateTime;

/**
 * The Visitor record represents a visitor with a first name, last name, chosen doctor, and a timestamp indicating when the visitor registered.
 * <p>
 * A record is a concise way to define classes that primarily hold data. In this case, the Visitor record holds data about a visitor in a hospital.
 *
 * @param name the first name of the visitor.
 * @param lastName the last name of the visitor.
 * @param doctor the doctor chosen by the visitor. If null, it indicates the visitor is visiting a patient.
 * @param timestamp the date and time when the visitor registered.
 */
public record Visitor(String name, String lastName, Doctor doctor, LocalDateTime timestamp) {
}
