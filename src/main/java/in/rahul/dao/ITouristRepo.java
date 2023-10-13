package in.rahul.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import in.rahul.model.Tourist;

public interface ITouristRepo extends JpaRepository<Tourist, Integer> {

}
