SECO_FIRMWARE_NAME              ?= "UNSUPPORTED"
SECO_FIRMWARE_NAME_mx8qm         = "mx8qmb0-ahab-container.img"
SECO_FIRMWARE_NAME_mx8qxp        = \
    "${@bb.utils.contains('MACHINE_FEATURES', 'soc-revb0', 'mx8qxb0-ahab-container.img', \
                                                           'mx8qxc0-ahab-container.img', d)}"
SECO_FIRMWARE_NAME_mx8phantomdxl = "mx8qxc0-ahab-container.img"
SECO_FIRMWARE_NAME_mx8dxl        = "mx8dxla1-ahab-container.img"
