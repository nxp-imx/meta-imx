
FSL_BASIC_PKG = "\
    ${MACHINE_EXTRA_RRECOMMENDS} \
    ${@base_contains("MACHINE_FEATURES", "usbhost", "usbutils", "", d)} \
    ${@base_contains("MACHINE_FEATURES", "alsa", "alsa-utils-alsamixer", "", d)} \
    ${@base_contains("MACHINE_FEATURES", "usbgadget", "kernel-module-g-ether kernel-module-g-serial kernel-module-g-mass-storage", "", d)} \
    \
    ${@base_contains("DISTRO_FEATURES", "bluetooth", "${BLUEZ}", "", d)} \
    ${@base_contains("DISTRO_FEATURES", "wifi", "iw wpa-supplicant", "", d)} \
    \
    tzdata \
    \
    cpufrequtils \
    htop \
"

RRECOMMENDS_${PN} = ""
RRECOMMENDS_${PN}_mx6 = "${FSL_BASIC_PKG}"
RRECOMMENDS_${PN}_mx7 = "${FSL_BASIC_PKG}"
RRECOMMENDS_${PN}_mx6ul = "${FSL_BASIC_PKG}"

