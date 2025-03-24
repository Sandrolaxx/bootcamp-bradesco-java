package com.aktie.aktieapi.dto;

import java.time.LocalDate;

public record UserDTO(String name, String email, String phone, LocalDate birthday, String password) {
}
