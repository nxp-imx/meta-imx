require xserver-xorg.inc

LIC_FILES_CHKSUM = "file://COPYING;md5=5df87950af51ac2c5822094553ea1880"


# Misc build failure for master HEAD
SRC_URI += "file://fix_open_max_preprocessor_error.patch \
           "

SRC_URI[md5sum] = "397e405566651150490ff493e463f1ad"
SRC_URI[sha256sum] = "f61120612728f2c5034671d0ca3e2273438c60aba93b3dda4a8aa40e6a257993"

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