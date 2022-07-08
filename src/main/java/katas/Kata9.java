package katas;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import model.Bookmark;
import model.Movie;
import model.MovieList;
import util.DataUtil;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
    Goal: Retrieve each video's id, title, middle interesting moment time, and smallest box art url
    DataSource: DataUtil.getMovies()
    Output: List of ImmutableMap.of("id", 5, "title", "some title", "time", new Date(), "url", "someUrl")
*/
public class Kata9 {
    public static List<Map> execute() {
        List<MovieList> movieLists = DataUtil.getMovieLists();

        return movieLists.stream()
                .flatMap(list -> list.getVideos().stream())
                .map(m -> ImmutableMap.of("id", m.getId(),
                        "title",  m.getTitle(),
                        "time" , m.getInterestingMoments().stream()
                                .filter(interestingMoment -> interestingMoment.getType() == "Middle"),
                        "boxart",m.getBoxarts().stream()
                                .min((box1,box2)->Integer.compare(box1.getUrl().length(), box2.getUrl().length())).get().toString()))
                .collect(Collectors.toList());
    }
}
