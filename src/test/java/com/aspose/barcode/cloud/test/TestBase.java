package com.aspose.barcode.cloud.test;

import java.nio.file.Paths;
import java.util.UUID;

public class TestBase {

    protected static final String accessToken =
            "eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCJ9.eyJuYmYiOjE1OTY3MDYzNjgsImV4cCI6MTU5Njc5Mjc2OCwiaXNzIjoiaHR0cHM6Ly9hcGkuYXNwb3NlLmNsb3VkIiwiYXVkIjpbImh0dHBzOi8vYXBpLmFzcG9zZS5jbG91ZC9yZXNvdXJjZXMiLCJhcGkucGxhdGZvcm0iLCJhcGkucHJvZHVjdHMiLCJhcGkuc3RvcmFnZSJdLCJjbGllbnRfaWQiOiI3NjU4MTMwMC1hZDNlLTRhNGMtYWU3MS1lMDI4ZjYwMjcwOTIiLCJjbGllbnRfZGVmYXVsdF9zdG9yYWdlIjoiQjJEMzUzREYtNDAyMS00N0QzLTkyQjItMjQ0NzYyMzlDRTc3IiwiY2xpZW50X2lkU3J2SWQiOiI4MTQwNDEiLCJzY29wZSI6WyJhcGkucGxhdGZvcm0iLCJhcGkucHJvZHVjdHMiLCJhcGkuc3RvcmFnZSJdfQ.KXwbZgzd0EnxUg4MHdxntybW-k1GB2b2bCnPTISBZW8xfHeESb-VfTwWreF6XvgwUXU-xXj4hVPgd_3MI3et1aLqvbOPjdlHbFeGdApd2-0ngSgnMn-g0AKkFwo6jLBA2b3HMHB8iUJTPFLUb8Q_MghWdqxp8MVxPHsEb3RLR95JvoCU_NfL7ORjixew3cRMEzo5ItubsIl_1kIbtPa58e49XDC8GVj0rPdxMFeqcXEU0GbLS5QKd6IBwFgYW5fxV8ScU8nxt5ka9qtCVqCMt-QUG81h3xV6bwZLIx1eOK-zELtBw_KnOSwVigBNcRHyqLBEqe7wgi69u8v78hE2Hg";

    protected static final String testDataPath = Paths.get("test_data").toAbsolutePath().toString();
    protected static final String testStorageName = "First Storage";
    protected static final String remoteTempFolder = "BarcodeTests/" + UUID.randomUUID() + "/";
}
