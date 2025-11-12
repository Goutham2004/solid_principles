package PaymentMethod;

// Abstraction: This interface defines a contract for payment methods, abstracting the common behavior (pay) without specifying the implementation.
// Interface Segregation Principle: This interface is small and focused on a single responsibility (payment), so clients don't depend on methods they don't use.
// Dependency Inversion Principle: This abstraction allows high-level modules to depend on it, rather than on concrete payment method implementations.
public interface PaymentMethod {
    void pay();
}
