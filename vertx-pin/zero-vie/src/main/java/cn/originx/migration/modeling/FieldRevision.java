package cn.originx.migration.modeling;

import cn.vertxup.atom.domain.tables.pojos.MField;

public class FieldRevision extends AbstractRevision {

    public FieldRevision() {
        super(MField.class);
    }
}
