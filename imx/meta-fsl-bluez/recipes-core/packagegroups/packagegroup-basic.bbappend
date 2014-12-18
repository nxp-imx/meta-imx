
RRECOMMENDS_${PN}_mx6 = "\
    ${MACHINE_EXTRA_RRECOMMENDS} \
    ${@base_contains("MACHINE_FEATURES", "usbhost", "usbutils", "", d)} \
    ${@base_contains("MACHINE_FEATURES", "alsa", "alsa-utils-alsamixer", "", d)} \
    ${@base_contains("MACHINE_FEATURES", "usbgadget", "kernel-module-g-ether kernel-module-g-serial kernel-module-g-mass-storage", "", d)} \
    \
    ${@base_contains("DISTRO_FEATURES", "bluetooth", "${VIRTUAL-RUNTIME_virtual/bluez}", "", d)} \
    ${@base_contains("DISTRO_FEATURES", "wifi", "iw wpa-supplicant", "", d)} \
    \
    tzdata \
    \
    cpufrequtils \
    htop \
"
