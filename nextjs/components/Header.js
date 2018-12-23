import Link from 'next/link'
import { AppBar, Toolbar, IconButton, Typography, Button } from '@material-ui/core';
import MenuIcon from '@material-ui/core/Menu';

const linkStyle = {
  marginRight: 15
}

const Header = () => (
    <div>
		<AppBar>
			<Toolbar>
				<Link href="/">
					<Button>Home</Button>
		        </Link>
		        <Link href="/about">
		        	<Button>About</Button>
		        </Link>
		        <Link href="/login">
		        	<Button>Login</Button>
		        </Link>
		        <Typography>
					News
				</Typography>
				<IconButton>
					<MenuIcon>
					</MenuIcon>
				</IconButton>
			</Toolbar>
		</AppBar>
    </div>
)

export default Header