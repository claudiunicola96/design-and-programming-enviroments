package model;

/**
 * @param <Id>
 */
public interface HasId<Id> {
    /**
     * @return Id
     */
    Id getId();

    /**
     * @param id The id of object.
     * @return HasId
     */
    HasId<Id> setId(Id id);
}
