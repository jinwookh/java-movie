import domain.Movie;
import domain.MovieRepository;

import input.Continue;
import input.MemberNumberInput;
import input.ScheduleInput;
import view.InputView;
import view.OutputView;


import java.time.LocalDateTime;
import java.util.List;

public class MovieApplication {
    public static void main(String[] args) {
        List<Movie> movies = MovieRepository.getMovies();
        OutputView.printMovies(movies);

        Movie movie = InputView.inputMovie(movies);
        OutputView.printMovies(movie);
        int scheduleId = InputView.getScheduleId(movie);
        // TODO 구현 진행
        int memberNumber = InputView.getMemberNumber(movie, scheduleId);
        Continue choice = InputView.askContinuePurchaseOrNot();
        System.out.println(choice);

    }
}
