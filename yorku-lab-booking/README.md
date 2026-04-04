## this was ran on VS studio code so it may not work for everyone
## inorder to run it make sure that you are in the yorku-lab-booking folder before running mvn javafx:run

## Testing

This project includes comprehensive testing with unit tests, auto-generated tests, and mutation testing.

### Running Tests

#### Unit Tests
```bash
# Run all unit tests
mvn test

# Run specific test class
mvn test -Dtest=BookingServiceTest

# Run specific test method
mvn test -Dtest=BookingServiceTest#testBookEquipment
```

#### Auto-Generated Tests (Randoop)
The project includes 1775+ auto-generated regression tests created with Randoop:
```bash
# Run Randoop-generated tests
mvn test -Dtest=Randoop.RegressionTest
```

### Mutation Testing with PIT

PIT (PITest) performs mutation testing to evaluate test quality by introducing bugs and checking if tests detect them.

#### Run Full Mutation Testing
```bash
mvn org.pitest:pitest-maven:mutationCoverage
```

#### Run Mutation Testing on Specific Classes

**Option 1: Modify pom.xml**
Edit the `targetClasses` section in the PIT plugin configuration:

```xml
<targetClasses>
    <param>com.yorku.booking.BookingService</param>
    <param>com.yorku.command.ReserveCommand</param>
    <param>com.yorku.coordinator.LabManager</param>
</targetClasses>
```

**Option 2: Command Line**
```bash
# Run on specific classes
mvn org.pitest:pitest-maven:mutationCoverage -DtargetClasses=com.yorku.booking.*,com.yorku.command.*

# Run on single class
mvn org.pitest:pitest-maven:mutationCoverage -DtargetClasses=com.yorku.booking.BookingService
```

#### Understanding PIT Results
- **Line Coverage**: Percentage of code lines executed by tests
- **Mutation Coverage**: Percentage of artificial bugs detected by tests
- **Test Strength**: Effectiveness of tests at detecting mutations

View detailed results in `target/pit-reports/index.html` after running PIT.

#### PIT Configuration Options
- `targetClasses`: Classes to mutate (default: `com.yorku.*`)
- `targetTests`: Test classes to run (default: all test classes)
- `mutators`: Types of mutations to apply
- `threads`: Number of threads for parallel execution

### Test Coverage Summary
- **Line Coverage**: 38% (196/510 lines)
- **Mutation Coverage**: 14% (32/235 mutants)
- **Test Strength**: 47% (32/68 tests)