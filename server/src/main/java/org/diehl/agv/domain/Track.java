package org.diehl.agv.domain;

import java.util.List;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class Track {

  private String id;
  private String name;
  private Position start;
  private String user;

  private List<Position> data;

}
