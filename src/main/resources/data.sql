CREATE TABLE events (
    id_event INT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    event_date DATE NOT NULL,
    description TEXT
);

-- Insert some sample data
INSERT INTO events (title, event_date, description) VALUES
('Event 1', '2023-10-01', 'Description for Event 1'),
('Event 2', '2023-10-02', 'Description for Event 2'),
('Event 3', '2023-10-03', 'Description for Event 3');