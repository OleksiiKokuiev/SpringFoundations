package dependson;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.ejb.DependsOn;
import java.io.File;

@Component
@DependsOn("fileCreatorImpl")
public class FileHandlerImpl implements FileHandler {
    @Override
    @Value("${file.location}")
    public void printFileInfo(String fileLocation) {
        File file = new File(fileLocation);
        System.out.println(file.length());
    }
}
