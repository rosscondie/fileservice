package com.codeclan.fileservice.controllers;

import com.codeclan.fileservice.models.Folder;
import com.codeclan.fileservice.repositories.FolderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FolderController {
    @Autowired
    FolderRepository folderRepository;

    // SHOW ALL ROUTE
    @GetMapping(value = "/folders")
    public ResponseEntity<List<Folder>> getAllFolders() {
        return new ResponseEntity<>(folderRepository.findAll(), HttpStatus.OK);
    }

    // SHOW ONE ROUTE
    @GetMapping(value = "/folders/{id}")
    public ResponseEntity getFolder(@PathVariable Long id) {
        return new ResponseEntity(folderRepository.findById(id), HttpStatus.OK);
    }

    // SAVE/CREATE ROUTE
    // UPDATE ROUTE
    // DELETE ROUTE
}
