# fsl-eula-graphics.bbclass extends the naming scheme in fsl-eula.bbclass
# to allow for graphics-backend-specific archives.
IMX_PACKAGE_NAME_APPEND = ""
IMX_PACKAGE_NAME_APPEND:class-target = \
    "${@bb.utils.contains('DISTRO_FEATURES', 'wayland', '-wayland', \
        bb.utils.contains('DISTRO_FEATURES',     'x11',     '-x11', \
                                                             '-fb', d), d)}"
IMX_PACKAGE_NAME:append:class-target = "${IMX_PACKAGE_NAME_APPEND}"
SRC_URI_NAME:append:class-target     = "${IMX_PACKAGE_NAME_APPEND}"
