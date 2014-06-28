bug-generic-grooy-traits
========================

This repository demonstrates an issue with using generic traits in Groovy 2.3.3.

An attempt was made to define both a Monad trait and abstract class to compare the differences.  Both of these classes have just the usual two abstract methods for monads: unit and flatMap (aka bind).  A class based on the monad class (IdentityMonadFromClass) and one based on the trait (IdentityMonadFromTrait) were created.

When some tests are performed, the monad class based on the class worked fine, but the monad class based on the trait had an error.  The was an underlying NullPointerException caused in the TypeResolver (see /doc/stacktrace.txt for the full stacktrace).  This caused an ExceptionInIntializerError.

This was compiled and run with Gradle 1.12.



