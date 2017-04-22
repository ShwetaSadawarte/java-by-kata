import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class TrueCommandKata {
    @Test
    public void givenTrueAsInput_ReturnsSuccess() {
        Boolean status = false;
        TrueKata.printResult(status);
        Assert.assertTrue(status);
    }

    @Ignore
    @Test
    public void givenTrueAsInput_ReturnsFailure() {
        TrueKata.printResult(false);
        Assert.assertFalse(false);
    }
}
