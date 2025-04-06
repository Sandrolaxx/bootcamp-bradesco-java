package br.com.dio.persistence.converter;

import static java.time.ZoneOffset.UTC;
import static java.util.Objects.nonNull;

import java.sql.Timestamp;
import java.time.OffsetDateTime;

public final class OffsetDateTimeConverter {

    public static OffsetDateTime toOffsetDateTime(final Timestamp value){
        return nonNull(value) ? OffsetDateTime.ofInstant(value.toInstant(), UTC) : null;
    }

    public static Timestamp toTimestamp(final OffsetDateTime value){
        return nonNull(value) ? Timestamp.valueOf(value.atZoneSameInstant(UTC).toLocalDateTime()) : null;
    }

}
