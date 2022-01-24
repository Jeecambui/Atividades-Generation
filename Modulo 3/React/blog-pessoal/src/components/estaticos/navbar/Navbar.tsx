import React from 'react';
import { AppBar, Box, Toolbar, Typography} from '@material-ui/core';
import { Link } from 'react-router-dom'
import './Navbar.css'

function Navbar (){
    return(
        <>
            <AppBar position="static">

            <Toolbar variant="dense">
                <Box style={{ cursor: "pointer"}} >
                    <Typography variant="h5" color="inherit">
                        BlogPessoal
                    </Typography>
                </Box>

                <Box display="flex" justifyContent="start">
                    <Box mx={1} className='cursor'>
                        <Typography variant="h6" color="inherit">
                            home
                        </Typography>
                    </Box>
                </Box>

                <Box display="flex" justifyContent="start">
                    <Box mx={1} className='cursor'>
                        <Typography variant="h6" color="inherit">
                            postagens
                        </Typography>
                    </Box>
                </Box>

                <Box display="flex" justifyContent="start">
                    <Box mx={1} className='cursor'>
                        <Typography variant="h6" color="inherit">
                            temas
                        </Typography>
                    </Box>
                </Box>

                <Box display="flex" justifyContent="start">
                    <Box mx={1} className='cursor'>
                        <Typography variant="h6" color="inherit">
                            cadastrar tema
                        </Typography>
                    </Box>
                </Box>

                <Link to='/login' className='text-decorator-none'>
                    <Box display="flex" justifyContent="start">
                        <Box mx={1} className='cursor'>
                            <Typography variant="h6" color="inherit">
                                logout
                            </Typography>
                        </Box>
                    </Box>
                </Link>


            </Toolbar>   

            </AppBar>
        </>
    )
}

export default Navbar;