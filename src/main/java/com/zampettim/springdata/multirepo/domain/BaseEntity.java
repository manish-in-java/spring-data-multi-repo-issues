/**
 *
 */
package com.zampettim.springdata.multirepo.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Version;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.util.Date;

/**
 * Base class that implements common aspects of all Domain/Entity objects
 *
 * @author mzampetti
 */
@MappedSuperclass
@Data
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public abstract class BaseEntity
{
  @Column(name = "last_modified_by")
  protected String lastModifiedBy;

  @Version
  @Column(name = "version")
  protected Long version;
}
