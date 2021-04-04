package quoters;

import aspects.aop.DatabaseRuntimeException;

public interface Quoter {
    void sayQuote() throws DatabaseRuntimeException;
}
