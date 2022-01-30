package assignments.ReplitAnswers.TableGenerator;

/**
 * this is an interface TableGenerator with 2 abstract methods.
 *
 * Any class that implements this interface can
 * 1. generate table in any way and 2. check table in any way.
 *
 * We do not currently know, how and what kind of table should be generated
 * and we do not even know how to check it. Since it is all ABSTRACT.
 * We know the functionality is there but implementation is hidden/not here.
 */

public interface ITableGenerator {
    int[] generateTable(int value, int numberOfEntries);
    boolean checkTable(int value, int[] tableToTest);

}
