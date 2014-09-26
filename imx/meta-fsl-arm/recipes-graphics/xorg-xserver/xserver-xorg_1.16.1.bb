require recipes-graphics/xorg-xserver/xserver-xorg.inc

# Misc build failure for master HEAD
SRC_URI += "file://fix_open_max_preprocessor_error.patch \
            file://xshmfence-option.patch \
           "

SRC_URI[md5sum] = "b1ff364222e921d32de40c4786e8bc47"
SRC_URI[sha256sum] = "f4677c6ec9fb7b59648321737087aeb9963b60bcea50ee3773fe46be1a37e060"

# These extensions are now integrated into the server, so declare the migration
# path for in-place upgrades.

RREPLACES_${PN} =  "${PN}-extension-dri \
                    ${PN}-extension-dri2 \
                    ${PN}-extension-record \
                    ${PN}-extension-extmod \
                    ${PN}-extension-dbe \
                   "
RPROVIDES_${PN} =  "${PN}-extension-dri \
                    ${PN}-extension-dri2 \
                    ${PN}-extension-record \
                    ${PN}-extension-extmod \
                    ${PN}-extension-dbe \
                   "
RCONFLICTS_${PN} = "${PN}-extension-dri \
                    ${PN}-extension-dri2 \
                    ${PN}-extension-record \
                    ${PN}-extension-extmod \
                    ${PN}-extension-dbe \
                   "
