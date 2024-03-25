package ru.danila.data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public interface IMDBMovie extends IMDBEntity {
    String getPreviewPath();
    String getShortDescription();
    String getTitleRu();
    String getTitleEn();
    List<IMDBAuthor> getAuthors();

    IMDBCompany getCompany();
    int getRating();

    LocalDate getStartDate();

    boolean isEnd();

    LocalDate getEndDate();
    // Film or Serial
    TypeMovie getTypeMovie();
}
