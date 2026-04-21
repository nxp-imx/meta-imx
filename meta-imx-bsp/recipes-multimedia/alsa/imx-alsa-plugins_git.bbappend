# Copyright 2026 NXP
SRCBRANCH = "master"
SRCREV = "23b4b31c86637edfbdc53abc6c4473bd00949316"

PACKAGECONFIG_SWPDM:mx9-nxp-bsp = "swpdm"

do_install:append() {
    install -d ${D}${libdir}/alsa-lib
    install -m 0644 ${B}/dcfilter/.libs/libasound_module_pcm_dcFilter.so ${D}${libdir}/alsa-lib/
}

