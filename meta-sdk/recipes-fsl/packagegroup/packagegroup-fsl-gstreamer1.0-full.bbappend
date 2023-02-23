RDEPENDS:${PN}:remove = " \
    ${@bb.utils.contains('LICENSE_FLAGS_ACCEPTED', 'commercial', 'gstreamer1.0-plugins-ugly-meta', '', d)} \
    ${@bb.utils.contains('LICENSE_FLAGS_ACCEPTED', 'commercial', 'packagegroup-fsl-gstreamer1.0-commercial', '', d)} \
"

