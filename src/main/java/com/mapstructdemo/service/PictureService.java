package com.mapstructdemo.service;

import org.mapstruct.Named;
import org.springframework.stereotype.Service;

@Service
public class PictureService {

    @Named("employeeToPictureUrl")
    public String employeeToPictureUrl(Employee employee) {
        String name = employee.getName();
        if (name.contains("Thomas")) {
            return "https://m.media-amazon.com/images/M/MV5BYzU5MzFhNmQtMmYzNy00MjZkLTljZDEtY2UxNGU1ZDQxMjU2XkEyXkFqcGdeQXVyOTc5MDI5NjE@._V1_FMjpg_UX1280_.jpg";
        } else if (name.contains("Chuck")) {
            return "https://m.media-amazon.com/images/M/MV5BMTI4MjIyNzY5OF5BMl5BanBnXkFtZTcwMTMxODgwMw@@._V1_FMjpg_UX1280_.jpg";
        } else if (name.contains("Marla")) {
            return "https://m.media-amazon.com/images/M/MV5BNDY1MzE3MTI0Nl5BMl5BanBnXkFtZTcwNDIwNTI5Mw@@._V1_FMjpg_UX1280_.jpg";
        } else {
            return null;
        }
    }
}
