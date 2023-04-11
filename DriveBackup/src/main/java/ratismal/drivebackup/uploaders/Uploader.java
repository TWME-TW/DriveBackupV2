package ratismal.drivebackup.uploaders;

import ratismal.drivebackup.uploaders.Authenticator.AuthenticationProvider;

import java.io.IOException;

public interface Uploader {
    public String getName();
    public String getId();
    public AuthenticationProvider getAuthProvider();
    public boolean isAuthenticated();
    public boolean isErrorWhileUploading();
    public void test(java.io.File testFile);
    public void uploadFile(java.io.File file, String type) throws IOException;
    public void close();
}
