package pl.wsb.fitnesstracker.user.api;

import jakarta.annotation.Nullable;

public record UserBasicInfoDto(@Nullable Long id, String firstName, String lastName) {
}