package com.course.graphql.component.fake;

import com.course.graphql.datasource.fake.FakeBookDataSource;
import com.netflix.graphql.dgs.DgsComponent;
import com.course.graphql.generated.types.Book;
import com.netflix.graphql.dgs.DgsData;
import com.netflix.graphql.dgs.InputArgument;
import org.apache.commons.lang3.StringUtils;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@DgsComponent
public class FakeBookDataResolver {

    @DgsData(parentType = "Query", field = "books")
    public List<Book> booksWrittenBy(@InputArgument(name = "author") Optional<String> authorName) {
        if (authorName.isEmpty() || StringUtils.isBlank(authorName.get())) {
            return FakeBookDataSource.BOOK_LIST;
        }

        return FakeBookDataSource.BOOK_LIST.stream()
                .filter(b -> StringUtils.containsIgnoreCase(b.getAuthor().getName(), authorName.get()))
                .collect(Collectors.toList());
    }
}
