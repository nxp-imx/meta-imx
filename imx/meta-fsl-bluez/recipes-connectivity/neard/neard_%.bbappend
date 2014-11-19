# Allow distribution to override it
VIRTUAL-RUNTIME_libbluetooth ?= "bluez4"

RRECOMMENDS_${PN} = "\
                     ${@base_contains('DISTRO_FEATURES', 'bluetooth', 'VIRTUAL-RUNTIME_virtual/bluez', '', d)} \
                     ${@base_contains('DISTRO_FEATURES', 'wifi','wpa-supplicant', '', d)} \
                    "

