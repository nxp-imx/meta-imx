
RRECOMMENDS_${PN} = "\
                     ${@base_contains('DISTRO_FEATURES', 'bluetooth', '${VIRTUAL-RUNTIME_virtual/bluez}', '', d)} \
                     ${@base_contains('DISTRO_FEATURES', 'wifi','wpa-supplicant', '', d)} \
                    "

