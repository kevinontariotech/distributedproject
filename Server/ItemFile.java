import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class ItemFile{
    //private variables for the item files
    private int id;
    private String fileName;
    private LocalDateTime lastUpdated;
    private String fileType;
    private String fileInfo;
    private int versionNumber;

    //time formatter
    private DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyy/MM/dd HH:mm:ss");

    //empty constructor
    ItemFile () {}

    ItemFile (String fileName, String fileType, String fileInfo) {
        this.lastUpdated = getCurrentTime();
    }

    ItemFile (int id, String fileName, String fileType, String fileInfo) {
        
    }

    public String getFileName () {
        return this.fileName;
    }

    public String getlastUpdated () {
        return dtf.format(this.lastUpdated);
    }

    public String getFileType () {
        return this.fileType;
    }

    public String getFileInfo () {
        return this.fileInfo;
    }

    public int getVersionNumber () {
        return this.versionNumber;
    }

    public LocalDateTime getCurrentTime() {
        
        LocalDateTime now = LocalDateTime.now();
        return now;
    }
    //todd add functions for itemfile to do
    //such as encryption/decryption
    // validation
    // inventory versioning
    //  - recover old version
    // searching by name
}
