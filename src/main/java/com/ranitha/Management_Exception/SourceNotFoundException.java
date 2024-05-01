package com.ranitha.Management_Exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class SourceNotFoundException extends RuntimeException {
  String msg="Book not found";
}
