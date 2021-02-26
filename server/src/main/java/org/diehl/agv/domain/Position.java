package org.diehl.agv.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class Position {

  private Double lon;
  private Double lat;
  private Double ele;

}
