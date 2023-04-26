package com.codeclan.fileservice.components;

import com.codeclan.fileservice.models.File;
import com.codeclan.fileservice.models.Folder;
import com.codeclan.fileservice.models.User;
import com.codeclan.fileservice.repositories.FileRepository;
import com.codeclan.fileservice.repositories.FolderRepository;
import com.codeclan.fileservice.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {
    @Autowired
    UserRepository userRepository;
    @Autowired
    FolderRepository folderRepository;
    @Autowired
    FileRepository fileRepository;

    public DataLoader() {
    }

    @Override
    public void run(ApplicationArguments args) {
        User ross = new User("Ross");
        userRepository.save(ross);

        Folder codeclan = new Folder("Week 1", ross);
        folderRepository.save(codeclan);

        Folder week_2 = new Folder("Week 2", ross);
        folderRepository.save(week_2);

        Folder week_3 = new Folder("Week 3", ross);
        folderRepository.save(week_3);

        File document = new File("CV", ".pdf", 12, codeclan);
        fileRepository.save(document);

        File pythonTest = new File("TDD", ".py", 30, codeclan);
        fileRepository.save(pythonTest);

        File javaHomework = new File("Java Homework", ".java", 20, codeclan);
        fileRepository.save(javaHomework);


    }
}
