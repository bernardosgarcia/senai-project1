package com.senai.project1.DTOs;

import java.time.LocalDateTime;

public record BookDTO(Integer bok_id,
                      String bok_title,
                      String bok_author,
                      int bok_isbn,
                      LocalDateTime bok_pub_date) {
}
