
RDEPENDS_packagegroup-base-bluetooth = "\
    virtual/bluez \
    ${@base_contains('COMBINED_FEATURES', 'alsa', 'libasound-module-bluez', '',d)} \
    "

