
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table
@Entity(name = "events")
public class Event() {
    @Id
    @GeneratedValue(strategy = GenerateValue.IDENTITY)
    @Column(name = "id_event")
    private Integer idEvent;

    @Column(name = "title")
    private String title;

    @Column(name = "event_date")
    private Date eventDate;

    @Column(name = "description")
    private String description;
}