import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.lang.StringBuilder;
public class ItemFile{
    //private variables for the item files
    private int id;
    private String fileName;
    private LocalDateTime lastUpdated;
    private String fileType;
    private int versionNumber;
    private Account creator;
    private String accessType[];

    //time formatter
    private DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyy/MM/dd HH:mm:ss");

    //empty constructor
    ItemFile () {}

    ItemFile (String fileName, String fileType, String fileInfo, Account creator) {
        this.lastUpdated = getCurrentTime();
    }

    ItemFile (int id, String fileName, String fileType, String fileInfo, Account creator) {
        
    }

    public int getId() {
        return this.id;
    }

    public String getFileName () {
        return this.fileName;
    }

    public void setFileName (String fileName) {
        this.fileName = fileName;
    }

    public String getlastUpdatedString () {
        return dtf.format(this.lastUpdated);
    }

    public LocalDateTime getLastUpdatedTime () {
        return this.lastUpdated;
    }

    public void setLastUpdate() {
        this.lastUpdated = getCurrentTime();
    }

    public String getFileType () {
        return this.fileType;
    }

    public int getVersionNumber () {
        return this.versionNumber;
    }

    public int updateVersion () {
        this.versionNumber++;
    }

    public String getCreatorName () {
        return this.creator.getName();
    }
    public LocalDateTime getCurrentTime() {
        
        LocalDateTime now = LocalDateTime.now();
        return now;
    }

    public StringBuilder printFileInfo() {
        //print file information
    }

    
    //todd add functions for itemfile to do
    //such as encryption/decryption
    // validation
    // inventory versioning
    //  - recover old version
    // searching by name

    //what is considered an update and what is considered a 
}
