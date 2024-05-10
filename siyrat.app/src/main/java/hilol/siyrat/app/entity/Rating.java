package hilol.siyrat.app.entity;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "rating")
public class Rating {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long allRating;
    private Long ratingAtBeginningOfTheWeek;
    private Long ratingAtBeginningOfTheMonth;
    private Long ratingByWeek;
    private Long ratingByMonth;

}
