DEPENDS += " \
    ${@bb.utils.contains('DISTRO_FEATURES', 'x11', 'libxrandr', '', d)} \
"
PACKAGECONFIG[ffmpeg] = "-DFEATURE_ffmpeg=ON -DFEATURE_pipewire=ON,-DFEATURE_ffmpeg=OFF,ffmpeg pipewire"
